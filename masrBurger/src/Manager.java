public abstract class Manager {
    protected  SandwichMenu sandwichMenu;
    protected  AdditionsMenu additionsMenu;

    public Manager(SandwichMenu sandwichMenu, AdditionsMenu additionsMenu) {
        this.sandwichMenu = sandwichMenu;
        this.additionsMenu = additionsMenu;
    }
    public abstract void start();
}
