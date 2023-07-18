import java.io.*;
class FH {
    public static void main(String args[]) throws IOException
    {
        FileInputStream in = null;
        FileOutputStream out = null;
        try{
            in = new FileInputStream("file.txt");
            out = new FileOutputStream("File2.txt");
            
            int c;
            while((c = in.read()) != -1)
            {
                out.write(c);
            }
        }
           finally{
            if(in!=null)
            in.close();
           }
        }
  }

