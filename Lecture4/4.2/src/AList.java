public class AList <datatype>  {
    public int size;
    public datatype[] items;

    public AList(){
        items = (datatype[])new Object[8];
        size = 0;
    }

    public AList(datatype[] m){
        items = m;
        size = m.length;

    }


    public void resize(int n){
        datatype[] a = (datatype[]) new Object[n];
        System.arraycopy(items, 0, a,0,size);
        items = a;

    }

    public void insert(datatype m, int pos){
        datatype[] q = (datatype[])new Object[items.length + 1];
        System.arraycopy(items,0,q,0,pos);
        q[pos] = m;
        System.arraycopy(items,pos,q,pos+1,items.length - pos);

        size += 1;
        items = q;

    }
    public void AddFirst(datatype m){
        if(size == items.length){
            resize(2 * size);
        }

        insert(m,0);

    }

    public void AddLast(datatype m){
        if(size == items.length){
            resize(2 * size);
        }
        items[size] = m;
        size += 1;

    }

    public datatype RemoveFirst(){
        datatype m = items[0];

        for(int i = 0; i< size - 2; i++){
            items[i] = items[i+1];
            items[0] = m;
        }

        size -= 1;
        return m;
    }

    public datatype RemoveLast(){
        datatype m = items[size-1];

       items[size-1] = null;

        size -= 1;
        return m;
    }

    public datatype getFirst(){

        return items[0];

    }

    public datatype getLast(){

        return items[size-1];
    }

    public datatype get(int i){
        if(i >= size){
            System.out.println("Element doesn't exist!!");
            return null;
        }

        return items[i];

    }


    public int size(){
        return size;

    }



}
