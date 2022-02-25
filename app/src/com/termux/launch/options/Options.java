package com.termux.launch.options;

import com.termux.launch.helpers.Helpers;

public class Options extends Helpers {

  public static void help() {
    print(
       "Usage:" 
       + "\n" + " launch" 
       + "\n" + "   Launch apps on android"
       + "\n" + ""
       + "\n" + "  -a --app     <app_name>     -- open app"
       + "\n" + "  -i --info    <app_name>     -- open app settings"
       + "\n" + "  -p --package <app_package>  -- open app from package"
       + "\n" + "  -u --update                 -- load all apps"
       + "\n" + "  -h --help                   -- show help"
    );
  }

}
