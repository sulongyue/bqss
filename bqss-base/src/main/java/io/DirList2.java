package io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * @Description TODO
 * @Date 2023/2/7 8:50
 * @Created by 18355
 */
public class DirList2 {
    public static FilenameFilter filter(final String regex){
        return new FilenameFilter() {
            private Pattern pattern = Pattern.compile(regex);
            @Override
            public boolean accept(File dir, String name) {
                return pattern.matcher(name).matches();
            }
        };
    }

    public static void main(String[] args) {
        File path = new File(".");
        String[]  list;
        if(args.length == 0){
            list = path.list();
        }else{
            list = path.list(filter(args[0]));
        }
        Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
        for(String dirItem : list){
            System.err.println(dirItem);
        }
    }
}
