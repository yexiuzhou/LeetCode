public class ReverseInteger {
    public int reverse(int x) {
        Boolean neg = false;
        int r = 0;
        int p = 0;

        if (x<0){
            neg = true;
            x = -x;
            if (x<0){
                return 0;
            }
        }

        while (x>0){
            int c = x%10;
            r = r*10 + c;
            if ((r-c)/10 != p){
                return 0;
            }
            x = x/10;
            p=r;
        }

        if (neg){
            return -r;
        } else{
            return r;
        }
    }
}
