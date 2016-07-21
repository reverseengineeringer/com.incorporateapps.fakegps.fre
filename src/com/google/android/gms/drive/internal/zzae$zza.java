package com.google.android.gms.drive.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.MetadataBuffer;
import com.google.android.gms.drive.events.ChangeEvent;
import com.google.android.gms.drive.events.ChangeListener;
import com.google.android.gms.drive.events.ChangesAvailableEvent;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.drive.events.CompletionListener;
import com.google.android.gms.drive.events.DriveEvent;
import com.google.android.gms.drive.events.QueryResultEventParcelable;
import com.google.android.gms.drive.events.TransferProgressEvent;
import com.google.android.gms.drive.events.internal.zza;
import com.google.android.gms.drive.events.zzc;
import com.google.android.gms.drive.events.zzf;
import com.google.android.gms.drive.events.zzh;
import com.google.android.gms.drive.events.zzi;
import com.google.android.gms.drive.events.zzm;

class zzae$zza
  extends Handler
{
  private final Context mContext;
  
  private zzae$zza(Looper paramLooper, Context paramContext)
  {
    super(paramLooper);
    mContext = paramContext;
  }
  
  private static void zza(zzm paramzzm, QueryResultEventParcelable paramQueryResultEventParcelable)
  {
    DataHolder localDataHolder = paramQueryResultEventParcelable.zzsX();
    if (localDataHolder != null) {
      paramzzm.zza(new zzae.zza.1(new MetadataBuffer(localDataHolder)));
    }
    if (paramQueryResultEventParcelable.zzsY()) {
      paramzzm.zzcJ(paramQueryResultEventParcelable.zzsZ());
    }
  }
  
  public void handleMessage(Message paramMessage)
  {
    switch (what)
    {
    default: 
      zzz.zze(mContext, "EventCallback", "Don't know how to handle this event");
      return;
    }
    Object localObject = (Pair)obj;
    paramMessage = (zzf)first;
    localObject = (DriveEvent)second;
    switch (((DriveEvent)localObject).getType())
    {
    case 5: 
    case 6: 
    case 7: 
    default: 
      zzz.zzz("EventCallback", "Unexpected event: " + localObject);
      return;
    case 1: 
      ((ChangeListener)paramMessage).onChange((ChangeEvent)localObject);
      return;
    case 2: 
      ((CompletionListener)paramMessage).onCompletion((CompletionEvent)localObject);
      return;
    case 3: 
      zza((zzm)paramMessage, (QueryResultEventParcelable)localObject);
      return;
    case 4: 
      ((zzc)paramMessage).zza((ChangesAvailableEvent)localObject);
      return;
    }
    localObject = new zza(((TransferProgressEvent)localObject).zzta());
    ((zzi)paramMessage).zza((zzh)localObject);
  }
  
  public void zza(zzf paramzzf, DriveEvent paramDriveEvent)
  {
    sendMessage(obtainMessage(1, new Pair(paramzzf, paramDriveEvent)));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzae.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */