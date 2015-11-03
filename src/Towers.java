/**
 * Created by devon on 11/3/2015.
 */
public class Towers {
    public static void main(String[] args){
        int n_disks = 4;
        hanoi(n_disks, 'A','B','C');
    }
    public static void hanoi(int num_disks,char poleA, char poleB,char poleC){
        if(num_disks == 1)
            System.out.println("Disk 1 from "+poleA+" to "+poleC);
        else{
            hanoi(num_disks-1,poleA,poleC,poleB);
            System.out.println("Disk "+num_disks+" from "+poleA+" to "+poleC);
            hanoi(num_disks-1,poleB,poleA,poleC);
        }
    }
}
