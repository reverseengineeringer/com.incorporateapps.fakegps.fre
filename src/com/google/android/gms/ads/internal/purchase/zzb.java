package com.google.android.gms.ads.internal.purchase;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.internal.zzin;
import java.lang.reflect.Method;

public class zzb
{
  private final Context mContext;
  private final boolean zzFA;
  Object zzFz;
  
  public zzb(Context paramContext)
  {
    this(paramContext, true);
  }
  
  public zzb(Context paramContext, boolean paramBoolean)
  {
    mContext = paramContext;
    zzFA = paramBoolean;
  }
  
  public void destroy()
  {
    zzFz = null;
  }
  
  public void zzN(IBinder paramIBinder)
  {
    try
    {
      zzFz = mContext.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService$Stub").getDeclaredMethod("asInterface", new Class[] { IBinder.class }).invoke(null, new Object[] { paramIBinder });
      return;
    }
    catch (Exception paramIBinder)
    {
      while (!zzFA) {}
      zzin.zzaK("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.");
    }
  }
  
  public int zzb(int paramInt, String paramString1, String paramString2)
  {
    try
    {
      Class localClass = mContext.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService");
      paramInt = ((Integer)localClass.getDeclaredMethod("isBillingSupported", new Class[] { Integer.TYPE, String.class, String.class }).invoke(localClass.cast(zzFz), new Object[] { Integer.valueOf(paramInt), paramString1, paramString2 })).intValue();
      return paramInt;
    }
    catch (Exception paramString1)
    {
      if (zzFA) {
        zzin.zzd("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.", paramString1);
      }
    }
    return 5;
  }
  
  public Bundle zzb(String paramString1, String paramString2, String paramString3)
  {
    try
    {
      Class localClass = mContext.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService");
      paramString1 = (Bundle)localClass.getDeclaredMethod("getBuyIntent", new Class[] { Integer.TYPE, String.class, String.class, String.class, String.class }).invoke(localClass.cast(zzFz), new Object[] { Integer.valueOf(3), paramString1, paramString2, "inapp", paramString3 });
      return paramString1;
    }
    catch (Exception paramString1)
    {
      if (zzFA) {
        zzin.zzd("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.", paramString1);
      }
    }
    return null;
  }
  
  public int zzh(String paramString1, String paramString2)
  {
    try
    {
      Class localClass = mContext.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService");
      int i = ((Integer)localClass.getDeclaredMethod("consumePurchase", new Class[] { Integer.TYPE, String.class, String.class }).invoke(localClass.cast(zzFz), new Object[] { Integer.valueOf(3), paramString1, paramString2 })).intValue();
      return i;
    }
    catch (Exception paramString1)
    {
      if (zzFA) {
        zzin.zzd("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.", paramString1);
      }
    }
    return 5;
  }
  
  public Bundle zzi(String paramString1, String paramString2)
  {
    try
    {
      Class localClass = mContext.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService");
      paramString1 = (Bundle)localClass.getDeclaredMethod("getPurchases", new Class[] { Integer.TYPE, String.class, String.class, String.class }).invoke(localClass.cast(zzFz), new Object[] { Integer.valueOf(3), paramString1, "inapp", paramString2 });
      return paramString1;
    }
    catch (Exception paramString1)
    {
      if (zzFA) {
        zzin.zzd("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.", paramString1);
      }
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.purchase.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */