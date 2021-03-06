package com.google.android.gms.tagmanager;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.concurrent.LinkedBlockingQueue;

class zzat
  extends Thread
  implements zzas
{
  private static zzat zzbjb;
  private volatile boolean mClosed = false;
  private final Context mContext;
  private volatile boolean zzRE = false;
  private final LinkedBlockingQueue zzbja = new LinkedBlockingQueue();
  private volatile zzau zzbjc;
  
  private zzat(Context paramContext)
  {
    super("GAThread");
    if (paramContext != null) {}
    for (mContext = paramContext.getApplicationContext();; mContext = paramContext)
    {
      start();
      return;
    }
  }
  
  static zzat zzaZ(Context paramContext)
  {
    if (zzbjb == null) {
      zzbjb = new zzat(paramContext);
    }
    return zzbjb;
  }
  
  private String zzd(Throwable paramThrowable)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    PrintStream localPrintStream = new PrintStream(localByteArrayOutputStream);
    paramThrowable.printStackTrace(localPrintStream);
    localPrintStream.flush();
    return new String(localByteArrayOutputStream.toByteArray());
  }
  
  public void run()
  {
    while (!mClosed) {
      try
      {
        Runnable localRunnable = (Runnable)zzbja.take();
        if (!zzRE) {
          localRunnable.run();
        }
      }
      catch (InterruptedException localInterruptedException)
      {
        zzbg.zzaJ(localInterruptedException.toString());
      }
      catch (Throwable localThrowable)
      {
        zzbg.e("Error on Google TagManager Thread: " + zzd(localThrowable));
        zzbg.e("Google TagManager is shutting down.");
        zzRE = true;
      }
    }
  }
  
  public void zzgg(String paramString)
  {
    zzk(paramString, System.currentTimeMillis());
  }
  
  public void zzj(Runnable paramRunnable)
  {
    zzbja.add(paramRunnable);
  }
  
  void zzk(String paramString, long paramLong)
  {
    zzj(new zzat.1(this, this, paramLong, paramString));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tagmanager.zzat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */