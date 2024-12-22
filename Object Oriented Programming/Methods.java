class Cuboid{
    int length;
    int breadth;
    int height;

    void Volume(){
        System.out.println("The volume from Volume method: " + length*breadth*height);
    }

    int Volume_ret(){
        return length*breadth*height;
    }
}

class Methods{
    public static void main(String args[]){
        Cuboid c1 = new Cuboid();

        c1.length = 12;
        c1.breadth = 14;
        c1.height = 20;

        c1.Volume();
        int a  = c1.Volume_ret();
        System.out.println("The volume from Volume_ret: method" + a);
    }
}