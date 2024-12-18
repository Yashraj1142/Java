class Cuboid{
    int height;     //instance variable
    int width;      //instance variable
    int length;     //instance variable

    public static void main(String args[]){
        Cuboid c1 = new Cuboid();       //creating the object
        c1.height = 12;     //initialising the instance variable
        c1.width = 14;      //initialising the instance variable
        c1.length = 16;     //initialising the instance variable

        int vol = (c1.height)*(c1.width)*(c1.length);

        System.out.println("Height of the cuboid: " + c1.height);
        System.out.println("Width of the cuboid: " + c1.width);
        System.out.println("Length of the cuboid: " + c1.length);
        System.out.println("Volume of the cuboid: " + vol);
    }
}

