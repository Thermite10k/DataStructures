package HashTables;

import java.util.LinkedList;



public class HashFromScratch {
    //put(k, v)
    // get(k) => v
    //remove(k)
    // K:Integer, V: String
    // collision: chaining
    // LinkedList<Entry>[]
    //[ll, ll, ll...]
    
    private class Entry{
        private Integer key;
        private String value;
        public Entry(Integer k,String v){
            this.key=k;
            this.value=v;
        }
    }
    
    private Entry getEntry(int key){
        LinkedList<Entry> bucket = getbucket(key);
        if(bucket != null){

            for(var entry :bucket){
                if( entry.key == key){
                    return entry;
                }
            }
        }
            
        

        return null;


    }

    private LinkedList<Entry> getbucket(int k){
        
        return locallinkedList[HashFunct(k)];
    
    }

    private LinkedList<Entry>[] locallinkedList = new LinkedList[5];

    
    private Integer HashFunct(int key){
        return key % locallinkedList.length;
    }
    

    public void put(Integer k,String v){
        int hashedKey = HashFunct(k);

        if(locallinkedList[hashedKey]==null){
            locallinkedList[hashedKey] = new LinkedList<>();
        }
        var bucket = locallinkedList[hashedKey];


        for(var entry :bucket){
            if(entry.key == k){
                entry.value = v;
                return;
            }
        }


       
        bucket.addLast(new Entry(k, v));
        
    }

    public String get(int k){
        // int hashedKey = HashFunct(k);

        
        // var bucket = locallinkedList[hashedKey];
        // if(bucket != null){

        //     for(var entry : bucket){
        //         if(entry.key == k){
        //             return entry.value;
        //         }
        //     }
        // }
        // return null;

        // LinkedList<Entry> bucket = getbucket(k);
        // if(bucket != null){
        //     return getEntry(k).value;
        // }
        // return null;

        Entry entry = getEntry(k);
        
       
        return (entry == null)? null : entry.value;
        
        

    }

    public void remove(int k){
        // int hashedKey = HashFunct(k);

        // var bucket = locallinkedList[hashedKey];
        // if(bucket != null){
        //     for(var entry : bucket){
        //         if(entry.key == k){
        //             bucket.remove(entry);
        //             return;
        //         }
        //     }
        // }

        // throw new IllegalStateException();
        var entry = getEntry(k);
        if(entry == null){
            throw new IllegalStateException();
        }
        getbucket(k).remove(entry);
        
    }
}
