package com.google.android.gms.iid;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class MessengerCompat
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new MessengerCompat.1();
  Messenger zzaNd;
  zzb zzaNe;
  
  public MessengerCompat(Handler paramHandler)
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      zzaNd = new Messenger(paramHandler);
      return;
    }
    zzaNe = new MessengerCompat.zza(this, paramHandler);
  }
  
  public MessengerCompat(IBinder paramIBinder)
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      zzaNd = new Messenger(paramIBinder);
      return;
    }
    zzaNe = zzb.zza.zzcd(paramIBinder);
  }
  
  public static int zzc(Message paramMessage)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      return zzd(paramMessage);
    }
    return arg2;
  }
  
  private static int zzd(Message paramMessage)
  {
    return sendingUid;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    try
    {
      boolean bool = getBinder().equals(((MessengerCompat)paramObject).getBinder());
      return bool;
    }
    catch (ClassCastException paramObject) {}
    return false;
  }
  
  public IBinder getBinder()
  {
    if (zzaNd != null) {
      return zzaNd.getBinder();
    }
    return zzaNe.asBinder();
  }
  
  public int hashCode()
  {
    return getBinder().hashCode();
  }
  
  public void send(Message paramMessage)
  {
    if (zzaNd != null)
    {
      zzaNd.send(paramMessage);
      return;
    }
    zzaNe.send(paramMessage);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (zzaNd != null)
    {
      paramParcel.writeStrongBinder(zzaNd.getBinder());
      return;
    }
    paramParcel.writeStrongBinder(zzaNe.asBinder());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.iid.MessengerCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */