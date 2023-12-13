package stack;

public class dynamicstack extends customstack{
    public dynamicstack(){
        super();//this willl call the custom stack constructor in the customstack class;
    }

    @Override
    public boolean push(int item) {
        if(this.isfull()){
            int temp[]=new int[data.length*2];

        for(int i=0;i< data.length;i++){
            temp[i]=data[i];

        }
        data=temp;
        }
        return super.push(item);
    }

    public dynamicstack(int size){
        super(size);

}
}
