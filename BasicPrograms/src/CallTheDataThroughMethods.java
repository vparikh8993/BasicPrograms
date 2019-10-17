class InsertData {
    int rollnumber;
    String name;
    void insert(int r,String n)
    {
        rollnumber=r;
        name=n;
    }
    void print()
    {
        System.out.println("rollnumber is " +rollnumber+ " and name is " +name);
    }
}

class CallTheDataThroughMethods {

    public static void main(String[] args) {
        InsertData insertData = new InsertData();
        insertData.insert(45,"vishwa");
        insertData.print();
        insertData.insert(35,"priyal");
        insertData.print();
    }

}
