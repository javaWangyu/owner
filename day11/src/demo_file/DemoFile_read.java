package demo_file;

import java.io.*;
import java.util.ArrayList;

public class DemoFile_read {

    public static void main(String[] args) {

        try {
            File ff=new File("F:\\就业班\\张老师分享资料\\就业班资料\\随机点名系统\\students.txt");

            InputStream is=new FileInputStream(ff);

            InputStreamReader inputStreamReader=new InputStreamReader(is);

            BufferedReader bufferedReader=new BufferedReader(inputStreamReader);

            String s="";
			
			bbbbbbbbbbbbb

            ArrayList<String> stringArraylist=new ArrayList<>();


            while((s=bufferedReader.readLine())!=null&&s.trim().length()>0){

                stringArraylist.add(s);

            }

            System.out.println("==============打印学生名单开始========");

            for (int i = 0; i <stringArraylist.size() ; i++) {

                String res=stringArraylist.get(i);

                if(res.length()<3){

                    res+=" ";

                }

                if(i<10){

                    System.out.print("姓名[0"+(i+1)+"]"+res+"\t");

                }else{

                    System.out.print("姓名["+(i+1)+"]"+res+"\t");

                }



                if((i+1)%10==0){

                    System.out.println();
					ccccccccccccccccccc
					aaaaaaaaaaaaaaaaaaaaaaaa



                }

            }

        } catch (IOException e) {

            e.printStackTrace();
        }

    }


}
