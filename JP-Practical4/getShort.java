public int getShort(int num){

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
  return 0;
}
