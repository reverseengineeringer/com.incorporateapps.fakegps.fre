package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzx;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class zznk
  implements ThreadFactory
{
  private final int mPriority;
  private final String zzaoq;
  private final AtomicInteger zzaor = new AtomicInteger();
  private final ThreadFactory zzaos = Executors.defaultThreadFactory();
  
  public zznk(String paramString)
  {
    this(paramString, 0);
  }
  
  public zznk(String paramString, int paramInt)
  {
    zzaoq = ((String)zzx.zzb(paramString, "Name must not be null"));
    mPriority = paramInt;
  }
  
  public Thread newThread(Runnable paramRunnable)
  {
    paramRunnable = zzaos.newThread(new zznl(paramRunnable, mPriority));
    paramRunnable.setName(zzaoq + "[" + zzaor.getAndIncrement() + "]");
    return paramRunnable;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zznk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */