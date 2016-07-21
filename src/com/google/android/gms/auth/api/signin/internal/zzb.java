package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.zzu;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class zzb
  extends AsyncTaskLoader
  implements zzu
{
  private Semaphore zzXp = new Semaphore(0);
  private Set zzXq;
  
  public zzb(Context paramContext, Set paramSet)
  {
    super(paramContext);
    zzXq = paramSet;
  }
  
  protected void onStartLoading()
  {
    zzXp.drainPermits();
    forceLoad();
  }
  
  public Void zzmZ()
  {
    Iterator localIterator = zzXq.iterator();
    int i = 0;
    if (localIterator.hasNext())
    {
      if (!((GoogleApiClient)localIterator.next()).zza(this)) {
        break label80;
      }
      i += 1;
    }
    label80:
    for (;;)
    {
      break;
      try
      {
        zzXp.tryAcquire(i, 5L, TimeUnit.SECONDS);
        return null;
      }
      catch (InterruptedException localInterruptedException)
      {
        for (;;)
        {
          Log.i("GACSignInLoader", "Unexpected InterruptedException", localInterruptedException);
          Thread.currentThread().interrupt();
        }
      }
    }
  }
  
  public void zzna()
  {
    zzXp.release();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.api.signin.internal.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */