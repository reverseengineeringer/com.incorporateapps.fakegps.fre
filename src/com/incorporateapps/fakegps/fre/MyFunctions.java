package com.incorporateapps.fakegps.fre;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningServiceInfo;
import android.content.ComponentName;
import android.content.Context;
import android.location.Address;
import android.provider.Settings.System;
import java.util.List;

public class MyFunctions
{
  public static double a(double paramDouble)
  {
    return (int)(Math.pow(10.0D, 2.0D) * paramDouble) / Math.pow(10.0D, 2.0D);
  }
  
  public static String a(Address paramAddress)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramAddress.getAddressLine(paramAddress.getMaxAddressLineIndex() - 1)).append(",");
    localStringBuilder.append(paramAddress.getCountryName());
    return localStringBuilder.toString();
  }
  
  public static boolean a(Context paramContext)
  {
    boolean bool = false;
    if (Settings.System.getInt(paramContext.getContentResolver(), "airplane_mode_on", 0) != 0) {
      bool = true;
    }
    return bool;
  }
  
  public static String b(Address paramAddress)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int i = 0;
    for (;;)
    {
      if (i >= paramAddress.getMaxAddressLineIndex() - 1) {
        return localStringBuilder.toString();
      }
      localStringBuilder.append(paramAddress.getAddressLine(i));
      if (i != paramAddress.getMaxAddressLineIndex() - 2) {
        localStringBuilder.append(",");
      }
      i += 1;
    }
  }
  
  public static boolean b(Context paramContext)
  {
    paramContext = ((ActivityManager)paramContext.getSystemService("activity")).getRunningServices(750);
    int i = 0;
    for (;;)
    {
      if (i >= paramContext.size()) {
        return false;
      }
      ActivityManager.RunningServiceInfo localRunningServiceInfo = (ActivityManager.RunningServiceInfo)paramContext.get(i);
      if ((process.equals("com.incorporateapps.fakegps.fre")) && (service.getClassName().equals("com.incorporateapps.fakegps.fre.MockGPSService"))) {
        return true;
      }
      i += 1;
    }
  }
  
  public static boolean isLicensed()
  {
    return false;
  }
}

/* Location:
 * Qualified Name:     com.incorporateapps.fakegps.fre.MyFunctions
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */