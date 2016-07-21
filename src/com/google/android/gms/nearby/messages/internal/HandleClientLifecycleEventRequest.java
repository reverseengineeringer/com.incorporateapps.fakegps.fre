package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class HandleClientLifecycleEventRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzc();
  public final int versionCode;
  public final ClientAppContext zzbcs;
  public final int zzbct;
  
  HandleClientLifecycleEventRequest(int paramInt1, ClientAppContext paramClientAppContext, int paramInt2)
  {
    versionCode = paramInt1;
    zzbcs = paramClientAppContext;
    zzbct = paramInt2;
  }
  
  public HandleClientLifecycleEventRequest(ClientAppContext paramClientAppContext, int paramInt)
  {
    this(1, paramClientAppContext, paramInt);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzc.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.messages.internal.HandleClientLifecycleEventRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */