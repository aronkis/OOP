class Test
{
    public void g() throws ExceptieA 
    {
        throw new ExceptieA("Exceptie din g()");
    }

    public void f() throws ExceptieB 
    {
        try 
        {
            g();
        } 
        catch (ExceptieA e) 
        {
            System.out.println("Exceptie in f: " + e.getMessage());
            throw new ExceptieB("Exceptie din f()");
        }
    }
}

