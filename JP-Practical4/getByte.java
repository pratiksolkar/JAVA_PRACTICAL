public int getByte(int num){

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
  return 0;
}
