package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzr;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.LinkedList;

public class zzha
  implements Thread.UncaughtExceptionHandler
{
  private Context mContext;
  private VersionInfoParcel zzEZ;
  private Thread.UncaughtExceptionHandler zzHe;
  private Thread.UncaughtExceptionHandler zzHf;
  
  public zzha(Context paramContext, VersionInfoParcel paramVersionInfoParcel, Thread.UncaughtExceptionHandler paramUncaughtExceptionHandler1, Thread.UncaughtExceptionHandler paramUncaughtExceptionHandler2)
  {
    zzHe = paramUncaughtExceptionHandler1;
    zzHf = paramUncaughtExceptionHandler2;
    mContext = paramContext;
    zzEZ = paramVersionInfoParcel;
  }
  
  private static boolean zzA(Context paramContext)
  {
    return ((Boolean)zzbt.zzvG.get()).booleanValue();
  }
  
  public static zzha zza(Context paramContext, Thread paramThread, VersionInfoParcel paramVersionInfoParcel)
  {
    if ((paramContext == null) || (paramThread == null) || (paramVersionInfoParcel == null)) {
      return null;
    }
    if (!zzA(paramContext)) {
      return null;
    }
    Thread.UncaughtExceptionHandler localUncaughtExceptionHandler = paramThread.getUncaughtExceptionHandler();
    paramContext = new zzha(paramContext, paramVersionInfoParcel, localUncaughtExceptionHandler, Thread.getDefaultUncaughtExceptionHandler());
    if ((localUncaughtExceptionHandler == null) || (!(localUncaughtExceptionHandler instanceof zzha))) {
      try
      {
        paramThread.setUncaughtExceptionHandler(paramContext);
        return paramContext;
      }
      catch (SecurityException paramContext)
      {
        zzin.zzc("Fail to set UncaughtExceptionHandler.", paramContext);
        return null;
      }
    }
    return (zzha)localUncaughtExceptionHandler;
  }
  
  private Throwable zzb(Throwable paramThrowable)
  {
    if (((Boolean)zzbt.zzvH.get()).booleanValue()) {
      return paramThrowable;
    }
    LinkedList localLinkedList = new LinkedList();
    while (paramThrowable != null)
    {
      localLinkedList.push(paramThrowable);
      paramThrowable = paramThrowable.getCause();
    }
    paramThrowable = null;
    Throwable localThrowable;
    if (!localLinkedList.isEmpty())
    {
      localThrowable = (Throwable)localLinkedList.pop();
      StackTraceElement[] arrayOfStackTraceElement = localThrowable.getStackTrace();
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(new StackTraceElement(localThrowable.getClass().getName(), "<filtered>", "<filtered>", 1));
      int k = arrayOfStackTraceElement.length;
      int i = 0;
      int j = 0;
      if (i < k)
      {
        StackTraceElement localStackTraceElement = arrayOfStackTraceElement[i];
        if (zzat(localStackTraceElement.getClassName()))
        {
          localArrayList.add(localStackTraceElement);
          j = 1;
        }
        for (;;)
        {
          i += 1;
          break;
          if (zzau(localStackTraceElement.getClassName())) {
            localArrayList.add(localStackTraceElement);
          } else {
            localArrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
          }
        }
      }
      if (j == 0) {
        break label261;
      }
      if (paramThrowable == null)
      {
        paramThrowable = new Throwable(localThrowable.getMessage());
        label223:
        paramThrowable.setStackTrace((StackTraceElement[])localArrayList.toArray(new StackTraceElement[0]));
      }
    }
    label261:
    for (;;)
    {
      break;
      paramThrowable = new Throwable(localThrowable.getMessage(), paramThrowable);
      break label223;
      return paramThrowable;
    }
  }
  
  public void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    if (zza(paramThrowable)) {
      if (Looper.getMainLooper().getThread() != paramThread) {
        zza(paramThrowable, true);
      }
    }
    do
    {
      return;
      zza(paramThrowable, false);
      if (zzHe != null)
      {
        zzHe.uncaughtException(paramThread, paramThrowable);
        return;
      }
    } while (zzHf == null);
    zzHf.uncaughtException(paramThread, paramThrowable);
  }
  
  String zza(Class paramClass, Throwable paramThrowable, boolean paramBoolean)
  {
    StringWriter localStringWriter = new StringWriter();
    paramThrowable.printStackTrace(new PrintWriter(localStringWriter));
    return new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT)).appendQueryParameter("device", zzr.zzbC().zzht()).appendQueryParameter("js", zzEZ.afmaVersion).appendQueryParameter("appid", mContext.getApplicationContext().getPackageName()).appendQueryParameter("exceptiontype", paramClass.getName()).appendQueryParameter("stacktrace", localStringWriter.toString()).appendQueryParameter("eids", TextUtils.join(",", zzbt.zzdr())).appendQueryParameter("trapped", String.valueOf(paramBoolean)).toString();
  }
  
  public void zza(Throwable paramThrowable, boolean paramBoolean)
  {
    if (!zzA(mContext)) {}
    Throwable localThrowable;
    do
    {
      return;
      localThrowable = zzb(paramThrowable);
    } while (localThrowable == null);
    paramThrowable = paramThrowable.getClass();
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(zza(paramThrowable, localThrowable, paramBoolean));
    zzr.zzbC().zza(mContext, zzEZ.afmaVersion, localArrayList, zzr.zzbF().zzhe());
  }
  
  protected boolean zza(Throwable paramThrowable)
  {
    boolean bool = true;
    if (paramThrowable == null) {
      bool = false;
    }
    int j;
    int k;
    do
    {
      return bool;
      j = 0;
      k = 0;
      while (paramThrowable != null)
      {
        StackTraceElement[] arrayOfStackTraceElement = paramThrowable.getStackTrace();
        int m = arrayOfStackTraceElement.length;
        int i = 0;
        while (i < m)
        {
          StackTraceElement localStackTraceElement = arrayOfStackTraceElement[i];
          if (zzat(localStackTraceElement.getClassName())) {
            k = 1;
          }
          if (getClass().getName().equals(localStackTraceElement.getClassName())) {
            j = 1;
          }
          i += 1;
        }
        paramThrowable = paramThrowable.getCause();
      }
    } while ((k != 0) && (j == 0));
    return false;
  }
  
  protected boolean zzat(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return false;
    }
    if (paramString.startsWith("com.google.android.gms.ads")) {
      return true;
    }
    if (paramString.startsWith("com.google.ads")) {
      return true;
    }
    try
    {
      boolean bool = Class.forName(paramString).isAnnotationPresent(zzhb.class);
      return bool;
    }
    catch (Exception localException)
    {
      zzin.zza("Fail to check class type for class " + paramString, localException);
    }
    return false;
  }
  
  protected boolean zzau(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {}
    while ((!paramString.startsWith("android.")) && (!paramString.startsWith("java."))) {
      return false;
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzha
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */