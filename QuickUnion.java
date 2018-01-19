public class QuickUnion{
    private int[] id;
    public QuickUnion( int n ){
        id = new int[n];
        for( int i = 0; i < id.length; i++ ){
            id[i] = i;
        }
    }
    
    public int root( int i ){
        while( id[i] != i ){
            i = id[i];
        }
        return i;
    }
    
    public boolean find( int p, int q ){
        return root(p) == root(q);
    }
    
    public void union( int p, int q ){
        id[root(p)] = root(q);
    }
}