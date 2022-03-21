package org.daoTaskManager.entity;



public class User {

    private Long id;
    private String userName;
    private String name;
    private String lastName;



    public User(Long id, String userName, String name, String lastName) {
        this.id = id;
        this.userName = userName;
        this.name = name;
        this.lastName = lastName;
    }

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }




//    public static void showAllusers() {
////        Connection con = ConnectionToPostgress.startConnection();
//        Connection con = SingeltonToDb.connectSingleToBD();
//        String query = "SELECT * FROM users";
//        try (Statement statement = con.createStatement()) {
//            statement.executeQuery(query);
//            ResultSet resultSet = statement.executeQuery(query);
//          List<User> users = new ArrayList<>();
//            while (resultSet.next()) {
//                long id = resultSet.getLong("user_id");
//                String userName = resultSet.getString("user_name");
//                String firstName = resultSet.getString("user_lastname");
//                String lastName = resultSet.getString("user_username");
//
//                users.add(new User(id, userName, firstName, lastName));
//            }
//               for(User u:users){
//                   System.out.println(u);
//               }
//
//        } catch (SQLException throwables) {
//
//        }
//    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +

                '}';
    }
}
