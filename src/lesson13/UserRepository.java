package lesson13;

public class UserRepository {
    private User[] users = new User[10];

    public User[] getUsers() {
        return this.users;
    }

    public User update(User user) {
        if (user != null && this.findById(user.getId()) != null) {
            int index = 0;
            for (User userRecord : this.users) {
                if (userRecord.getId() == user.getId()) {
                    this.users[index] = user;
                    return user;
                }
                index++;
            }
        }

        return null;
    }

    public void delete(long id) {
        if (this.findById(id) != null) {
            int index = 0;

            for (User user : this.users) {
                if (user != null && user.getId() != id) {
                    this.users[index] = user;
                } else {
                    this.users[index] = null;
                }
                index++;
            }

            if (this.countUsers(this.users) != 0) {
                User[] newArray = new User[this.countUsers(this.users)];

                index = 0;
                for (User user : this.users) {
                    if (user != null) {
                        newArray[index] = user;
                    }

                }
                this.users = newArray;
            }
        }
    }

    public User save(User user) {
        if (user != null
                && this.users.length != Integer.MAX_VALUE
                && (this.users.length == 0 || this.users.length != this.countUsers(this.users))
                && this.findById(user.getId()) == null
            ) {
            int i = 0;

            for (User userRecord : this.users) {
                if (userRecord == null) {
                    this.users[i] = user;
                    return user;
                }
                i++;
            }
        }

        return null;
    }

    public String[] getUserNames() {
        if (this.users == null) {
            return null;
        }

        String[] result = new String[this.users.length];
        int i = 0;

        for (User user : this.users) {
            result[i++] = user != null ? user.getName() : null;
        }

        return result;
    }

    public long[] getUserIds() {
        if (this.users == null) {
            return null;
        }

        long[] result = new long[this.countUsers(this.users)];
        int i = 0;

        for (User user : this.users) {
            if (user != null) {
                result[i] = user.getId();
                i++;
            }
        }

        return result;
    }

    public String getUserNameById(long id) {
        if (this.users == null) {
            return null;
        }

        for (User user : this.users) {
            if (user != null && user.getId() == id) {
                return user.getName();
            }
        }

        return null;
    }

    public User getUserByName(String name) {
        int userIndex = this.findUserIndexByName(name);

        if (userIndex >= 0) {
            return this.getUserByIndex(userIndex);
        }

        return null;
    }

    public User getUserBySessionId(String sessionId) {
        if (sessionId != null) {
            for (User user : this.users) {
                if (user != null && sessionId.equals(user.getSessionId())) {
                    return this.getUserByName(user.getName());
                }
            }
        }

        return null;
    }

    public int findUserIndexByName(String name) {
        if (this.users != null && name != null) {
            int index = 0;
            for (User user : this.users) {
                if (user != null && name.equals(user.getName())) {
                    return index;
                }
                index++;
            }
        }

        return -1;
    }

    public User findById(long id) {
        if (id >= 0) {
            String userName = this.getUserNameById(id);

            if (userName != null) {
                return this.getUserByName(userName);
            }
        }

        return null;
    }

    private User getUserByIndex(int index) {
        return this.users[index];
    }

    private int countUsers(User[] users)
    {
        if (users == null) {
            return 0;
        }

        int countUsers = 0;

        for (User user : users) {
            if (user != null) {
                countUsers++;
            }
        }

        return countUsers;
    }
}
