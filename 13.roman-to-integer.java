

/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */
class Solution {
    public int romanToInt(String s) {

        int val;

        //字符数组比实际的字符数多一，防止越界
        char[] charArray=(s+" ").toCharArray();

        int cur=0;
        int pre=cur+1;

        int num=0;//转换后的数字
        while(cur<charArray.length-1){


            switch(charArray[cur]){
                //处理特殊的I
                case 'I':{
                    if(charArray[pre]=='V'){
                        num+=4;
                        cur++;
                    }else if(charArray[pre]=='X'){
                        num+=9;
                        cur++;
                    }else{
                        num+=1;
                    }
                    break;
                }
                case 'V':{
                    num+=5;
                    break;
                }

                //这个x也要特殊处理
                case 'X' :{
                    if(charArray[pre]=='L'){
                        num+=40;
                        cur++;
                    }else if(charArray[pre]=='C'){
                        num+=90;
                        cur++;

                    }else{
                        num+=10;
                    }

                    break;
                }

                case 'L':{
                    num+=50;
                    break;
                }
                //c需要特殊处理
                case 'C':{
                    if(charArray[pre]=='D'){
                        num+=400;
                        cur++;
                    }else if(charArray[pre]=='M'){
                        num+=900;
                        cur++;
                    }else{
                        num+=100;
                    }
                    break;
                }
                case 'D':{
                    num+=500;
                    break;
                }
                case 'M':{
                    num+=1000;
                    break;
                }
                default:{
                }
            }
            
            cur++;
            pre=cur+1;
           
        }

        return num;

    }
}

