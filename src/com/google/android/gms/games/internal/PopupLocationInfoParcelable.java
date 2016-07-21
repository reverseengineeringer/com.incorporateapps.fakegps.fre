package com.google.android.gms.games.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class PopupLocationInfoParcelable
  implements SafeParcelable
{
  public static final PopupLocationInfoParcelableCreator CREATOR = new PopupLocationInfoParcelableCreator();
  private final int mVersionCode;
  private final Bundle zzaFH;
  private final IBinder zzaFI;
  
  PopupLocationInfoParcelable(int paramInt, Bundle paramBundle, IBinder paramIBinder)
  {
    mVersionCode = paramInt;
    zzaFH = paramBundle;
    zzaFI = paramIBinder;
  }
  
  public PopupLocationInfoParcelable(PopupManager.PopupLocationInfo paramPopupLocationInfo)
  {
    mVersionCode = 1;
    zzaFH = paramPopupLocationInfo.zzxg();
    zzaFI = zzaFL;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final int getVersionCode()
  {
    return mVersionCode;
  }
  
  public final IBinder getWindowToken()
  {
    return zzaFI;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    PopupLocationInfoParcelableCreator.zza(this, paramParcel, paramInt);
  }
  
  public final Bundle zzxg()
  {
    return zzaFH;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.PopupLocationInfoParcelable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */