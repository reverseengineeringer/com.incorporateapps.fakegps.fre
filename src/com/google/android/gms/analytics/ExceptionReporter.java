package com.google.android.gms.analytics;

import android.content.Context;
import com.google.android.gms.analytics.internal.zzae;
import java.util.ArrayList;

public class ExceptionReporter
  implements Thread.UncaughtExceptionHandler
{
  private final Context mContext;
  private final Thread.UncaughtExceptionHandler zzPa;
  private final Tracker zzPb;
  private ExceptionParser zzPc;
  private GoogleAnalytics zzPd;
  
  public ExceptionReporter(Tracker paramTracker, Thread.UncaughtExceptionHandler paramUncaughtExceptionHandler, Context paramContext)
  {
    if (paramTracker == null) {
      throw new NullPointerException("tracker cannot be null");
    }
    if (paramContext == null) {
      throw new NullPointerException("context cannot be null");
    }
    zzPa = paramUncaughtExceptionHandler;
    zzPb = paramTracker;
    zzPc = new StandardExceptionParser(paramContext, new ArrayList());
    mContext = paramContext.getApplicationContext();
    paramContext = new StringBuilder("ExceptionReporter created, original handler is ");
    if (paramUncaughtExceptionHandler == null) {}
    for (paramTracker = "null";; paramTracker = paramUncaughtExceptionHandler.getClass().getName())
    {
      zzae.v(paramTracker);
      return;
    }
  }
  
  public ExceptionParser getExceptionParser()
  {
    return zzPc;
  }
  
  public void setExceptionParser(ExceptionParser paramExceptionParser)
  {
    zzPc = paramExceptionParser;
  }
  
  public void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    Object localObject = "UncaughtException";
    if (zzPc != null) {
      if (paramThread == null) {
        break label112;
      }
    }
    label112:
    for (localObject = paramThread.getName();; localObject = null)
    {
      localObject = zzPc.getDescription((String)localObject, paramThrowable);
      zzae.v("Reporting uncaught exception: " + (String)localObject);
      zzPb.send(new HitBuilders.ExceptionBuilder().setDescription((String)localObject).setFatal(true).build());
      localObject = zziC();
      ((GoogleAnalytics)localObject).dispatchLocalHits();
      ((GoogleAnalytics)localObject).zziG();
      if (zzPa != null)
      {
        zzae.v("Passing exception to the original handler");
        zzPa.uncaughtException(paramThread, paramThrowable);
      }
      return;
    }
  }
  
  GoogleAnalytics zziC()
  {
    if (zzPd == null) {
      zzPd = GoogleAnalytics.getInstance(mContext);
    }
    return zzPd;
  }
  
  Thread.UncaughtExceptionHandler zziD()
  {
    return zzPa;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.analytics.ExceptionReporter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */