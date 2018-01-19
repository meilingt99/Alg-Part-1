public class QuickUnion{
    private int[] id;
    private int[] sizes;
    public QuickUnion( int n ){
        id = new int[n];
        sizes = new int[n];
        for( int i = 0; i < id.length; i++ ){
            id[i] = i;
        }
        for( int i = 0; i < sizes.length; i++ ){
            sizes[i] = 1;
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
        int root_p = root(p);
        int root_q = root(q);
        if( sizes[root_p] < sizes[root_q] ){
            id[root_p] = root_q;
            sizes[root_q] += sizes[root_p];
        }
        else{
            id[root_q] = root_p;
            sizes[root_p] += sizes[root_q];
        }
    }
}