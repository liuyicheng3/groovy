String oldFilename = "./temp/old.txt"  
String newFilename = "new.txt"  
def count=1;
new File(oldFilename).renameTo(new File(oldFilename+count)) ;
