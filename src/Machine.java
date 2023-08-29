public class Machine {
    private String name;
    private int oilResidue;

    private boolean isAссessible;

    private int n;
    private static int machinesCount  = 0;




    public String getName() {
        return name;
    }

    public int getOilResidue() {
        return oilResidue;
    }

    public boolean isAссessible() {
        return isAссessible;
    }

    public int getN() {
        return n;
    }

    public static int getMachinesCount() {
        return machinesCount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOilResidue(int oilResidue) {
        this.oilResidue = oilResidue;
    }


    public void setN(int n) {
        this.n = n;
    }

    public static void setMachinesCount(int machinesCount) {
        Machine.machinesCount = machinesCount;
    }

    public Machine(String name, int oilResidue) {
        this.name = name;
        this.oilResidue = oilResidue;
        this.isAссessible = isAссessible;
        this.n = ++machinesCount;
    }

    public Machine() {
        this("machine", 100);
    }

    public Machine(String name)
    {
        this(name, 100);
    }

    private void setAссessible(boolean aссessible) {
        isAссessible = aссessible;
        System.out.println("Is accessible is: " + isAссessible);
    }

    private void doSomeWork(int oilNeeded)
    {
        this.oilResidue -=oilNeeded;
        System.out.println("Doing some work");
        System.out.println("Oil needed: " + oilNeeded);
        System.out.println("Work is done!");
        System.out.println("Rested oil: " + this.oilResidue);
    }
    public void work(int oilNeeded)
    {
        if (oilNeeded > this.oilResidue) {
            setAссessible(false);
        }
        else {
            doSomeWork(oilNeeded);
        }
    }

    public void refuel(int refOil)
    {
        setOilResidue(this.oilResidue+refOil);
        System.out.println("Ready for work!");
        setAссessible(true);
    }

}
