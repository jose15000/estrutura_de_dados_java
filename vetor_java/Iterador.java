import java.util.Iterator;

public class Iterador<T> {
    
T[] items;
int posicao = 0;

public Iterador(T[] items)
{
    this.items = items;
}

public Boolean IsPopulated ()
{
    if(posicao < 0 || posicao > items.length)
    {
        return false;
    }
    else
    {
        return true;
    }

}

public Object nextValue()
{
    Object item = items[posicao];
    posicao++;
    return item;
    
}

}
