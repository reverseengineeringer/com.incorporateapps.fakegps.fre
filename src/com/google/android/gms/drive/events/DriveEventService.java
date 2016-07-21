package com.google.android.gms.drive.events;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.drive.internal.OnEventResponse;
import com.google.android.gms.drive.internal.zzz;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public abstract class DriveEventService
  extends Service
  implements ChangeListener, CompletionListener, zzc, zzq
{
  public static final String ACTION_HANDLE_EVENT = "com.google.android.gms.drive.events.HANDLE_EVENT";
  private final String mName;
  int zzakz = -1;
  private CountDownLatch zzapL;
  DriveEventService.zza zzapM;
  boolean zzapN = false;
  
  protected DriveEventService()
  {
    this("DriveEventService");
  }
  
  protected DriveEventService(String paramString)
  {
    mName = paramString;
  }
  
  private void zza(OnEventResponse paramOnEventResponse)
  {
    paramOnEventResponse = paramOnEventResponse.zzts();
    zzz.zzy("DriveEventService", "handleEventMessage: " + paramOnEventResponse);
    for (;;)
    {
      try
      {
        switch (paramOnEventResponse.getType())
        {
        case 3: 
        case 5: 
        case 6: 
          zzz.zzz(mName, "Unhandled event: " + paramOnEventResponse);
          return;
        }
      }
      catch (Exception localException)
      {
        zzz.zza(mName, localException, "Error handling event: " + paramOnEventResponse);
        return;
      }
      onChange((ChangeEvent)paramOnEventResponse);
      return;
      onCompletion((CompletionEvent)paramOnEventResponse);
      return;
      zza((ChangesAvailableEvent)paramOnEventResponse);
      return;
      zza((TransferStateEvent)paramOnEventResponse);
      return;
    }
  }
  
  private void zzsV()
  {
    int i = getCallingUid();
    if (i == zzakz) {
      return;
    }
    if (GooglePlayServicesUtil.zzf(this, i))
    {
      zzakz = i;
      return;
    }
    throw new SecurityException("Caller is not GooglePlayServices");
  }
  
  protected int getCallingUid()
  {
    return Binder.getCallingUid();
  }
  
  public final IBinder onBind(Intent paramIntent)
  {
    for (;;)
    {
      try
      {
        if ("com.google.android.gms.drive.events.HANDLE_EVENT".equals(paramIntent.getAction()))
        {
          if ((zzapM == null) && (!zzapN))
          {
            zzapN = true;
            paramIntent = new CountDownLatch(1);
            zzapL = new CountDownLatch(1);
            new DriveEventService.1(this, paramIntent).start();
          }
          try
          {
            if (!paramIntent.await(5000L, TimeUnit.MILLISECONDS)) {
              zzz.zzA("DriveEventService", "Failed to synchronously initialize event handler.");
            }
            paramIntent = new DriveEventService.zzb(this).asBinder();
            return paramIntent;
          }
          catch (InterruptedException paramIntent)
          {
            throw new RuntimeException("Unable to start event handler", paramIntent);
          }
        }
        paramIntent = null;
      }
      finally {}
    }
  }
  
  public void onChange(ChangeEvent paramChangeEvent)
  {
    zzz.zzz(mName, "Unhandled change event: " + paramChangeEvent);
  }
  
  public void onCompletion(CompletionEvent paramCompletionEvent)
  {
    zzz.zzz(mName, "Unhandled completion event: " + paramCompletionEvent);
  }
  
  /* Error */
  public void onDestroy()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 29
    //   4: ldc -52
    //   6: invokestatic 77	com/google/android/gms/drive/internal/zzz:zzy	(Ljava/lang/String;Ljava/lang/String;)V
    //   9: aload_0
    //   10: getfield 153	com/google/android/gms/drive/events/DriveEventService:zzapM	Lcom/google/android/gms/drive/events/DriveEventService$zza;
    //   13: ifnull +53 -> 66
    //   16: aload_0
    //   17: getfield 153	com/google/android/gms/drive/events/DriveEventService:zzapM	Lcom/google/android/gms/drive/events/DriveEventService$zza;
    //   20: invokestatic 209	com/google/android/gms/drive/events/DriveEventService$zza:zza	(Lcom/google/android/gms/drive/events/DriveEventService$zza;)Landroid/os/Message;
    //   23: astore_1
    //   24: aload_0
    //   25: getfield 153	com/google/android/gms/drive/events/DriveEventService:zzapM	Lcom/google/android/gms/drive/events/DriveEventService$zza;
    //   28: aload_1
    //   29: invokevirtual 213	com/google/android/gms/drive/events/DriveEventService$zza:sendMessage	(Landroid/os/Message;)Z
    //   32: pop
    //   33: aload_0
    //   34: aconst_null
    //   35: putfield 153	com/google/android/gms/drive/events/DriveEventService:zzapM	Lcom/google/android/gms/drive/events/DriveEventService$zza;
    //   38: aload_0
    //   39: getfield 119	com/google/android/gms/drive/events/DriveEventService:zzapL	Ljava/util/concurrent/CountDownLatch;
    //   42: ldc2_w 167
    //   45: getstatic 174	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   48: invokevirtual 178	java/util/concurrent/CountDownLatch:await	(JLjava/util/concurrent/TimeUnit;)Z
    //   51: ifne +10 -> 61
    //   54: ldc 29
    //   56: ldc -41
    //   58: invokestatic 88	com/google/android/gms/drive/internal/zzz:zzz	(Ljava/lang/String;Ljava/lang/String;)V
    //   61: aload_0
    //   62: aconst_null
    //   63: putfield 119	com/google/android/gms/drive/events/DriveEventService:zzapL	Ljava/util/concurrent/CountDownLatch;
    //   66: aload_0
    //   67: invokespecial 217	android/app/Service:onDestroy	()V
    //   70: aload_0
    //   71: monitorexit
    //   72: return
    //   73: astore_1
    //   74: aload_0
    //   75: monitorexit
    //   76: aload_1
    //   77: athrow
    //   78: astore_1
    //   79: goto -18 -> 61
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	82	0	this	DriveEventService
    //   23	6	1	localMessage	android.os.Message
    //   73	4	1	localObject	Object
    //   78	1	1	localInterruptedException	InterruptedException
    // Exception table:
    //   from	to	target	type
    //   2	38	73	finally
    //   38	61	73	finally
    //   61	66	73	finally
    //   66	70	73	finally
    //   38	61	78	java/lang/InterruptedException
  }
  
  public boolean onUnbind(Intent paramIntent)
  {
    return true;
  }
  
  public void zza(ChangesAvailableEvent paramChangesAvailableEvent)
  {
    zzz.zzz(mName, "Unhandled changes available event: " + paramChangesAvailableEvent);
  }
  
  public void zza(TransferStateEvent paramTransferStateEvent)
  {
    zzz.zzz(mName, "Unhandled transfer state event: " + paramTransferStateEvent);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.events.DriveEventService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */