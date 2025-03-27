abstract class Beverage{
    private void pour(int qty)
    {
        System.out.println(" pour " + qty + "ml of beverage in a glass");
    }
    abstract protected void addCondiment();
    protected void stir(){}
    private void serve()
    {
        System.out.println(" serve through waiter");
    }
    public void templateMethod(int qty)
    {
        pour(qty);
        addCondiment();
        stir();
        serve();
    }
}