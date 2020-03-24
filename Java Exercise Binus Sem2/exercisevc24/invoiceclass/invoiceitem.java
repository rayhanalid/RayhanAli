package invoiceclass;

public class invoiceitem
{
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    public invoiceitem(String id, String desc, int qty, double unitPrice)
    {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public String getID()
    {
        return this.id;
    }

    public String getDesc()
    {
        return this.desc;
    }

    public int getQty()
    {
        return this.qty;
    }

    public void setQty(int qty)
    {
        this.qty = qty;
    }

    public double getUnitPrice()
    {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice)
    {
        this.unitPrice = unitPrice;
    }

    public double getTotal()
    {
        return unitPrice * qty;
    }

    @Override
    public String toString()
    {
        return "InvoiceItem[id=" + id + ",desc=" + desc + ",qty=" + qty + ",unitPrice=" + unitPrice + "]";
    }



    



};