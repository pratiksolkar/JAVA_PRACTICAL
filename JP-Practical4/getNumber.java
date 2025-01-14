public int getNumber(int num,String type){

if (type.compareToIgnoreCase("byte")==0){
  num = num % 256;
  
  if(num>=0){
    if(num <= 127){
      return num;
    }
    if(num > 127){
      num = num - 256;
      return num;
    }
  }
  else{
      if(num >= -128){
        return num;
      }
      if(num >= -255){
        num = num + 256;
        return num;
      }
  }
}    
else{
 if (type.compareToIgnoreCase("short")==0){   
  num = num % 65536;

  if(num>=0){
    if(num <= 32767){
      return num;
    }
    else if(num > 32767){
      num = num - 65536;
      return num;
    }
  }
  else{
      if(num >= -32768){
        return num;
      }
      if(num >= -65535){
        num = num + 65536;
        return num;
      }
  }
  }
}
return 0;
}
