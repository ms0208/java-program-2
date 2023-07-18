class SP {
    public static void main(String args[])
    {
        int i,j,k;
        System.out.println("Star Pattern");
        for(i=0;i<5;i++)
        {
            for(j=0;j<5;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Lower Left side Triangular ");
        for(i=0;i<5;i++)
        {
            for(j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Upper  Left side Triangular");
        for(i=0;i<5;i++)
        {
            for(j=5;j>i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Pyramid");
    
        for(i=1;i<=5;i++) 
        {
            for(j=5;j>i;j--) 
            {
               System.out.print(" ");
            }
             
            for(k=1;k<=i;k++)
            {
            System.out.print("* ");
            }
            
            System.out.println();
        }

        System.out.println("Lower right side Triangular");
        for(i=1;i<=5;i++)
        {
            for(j=5;j>i;j--)
            {
                System.out.print(" ");
            }
            for(k=1;k<i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Right side Lower Triangular");
        for(i=1;i<=5;i++)
        {
            for(j=1;j<5;j++)
            {
                System.out.print(" ");
            }
            for(k=1;k<i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println("Tilt Pyramid");
        for(i=1;i<=5;i++)
        {
            for(j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(k=1;k<i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}