package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.ChangesAvailableOptions;
import com.google.android.gms.drive.events.TransferProgressOptions;
import com.google.android.gms.drive.events.TransferStateOptions;

public class AddEventListenerRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zza();
  final int mVersionCode;
  final int zzanf;
  final DriveId zzaoz;
  final TransferStateOptions zzapY;
  final TransferProgressOptions zzapZ;
  final ChangesAvailableOptions zzapy;
  
  public AddEventListenerRequest(int paramInt, DriveId paramDriveId)
  {
    this(1, (DriveId)zzx.zzz(paramDriveId), paramInt, null, null, null);
  }
  
  AddEventListenerRequest(int paramInt1, DriveId paramDriveId, int paramInt2, ChangesAvailableOptions paramChangesAvailableOptions, TransferStateOptions paramTransferStateOptions, TransferProgressOptions paramTransferProgressOptions)
  {
    mVersionCode = paramInt1;
    zzaoz = paramDriveId;
    zzanf = paramInt2;
    zzapy = paramChangesAvailableOptions;
    zzapY = paramTransferStateOptions;
    zzapZ = paramTransferProgressOptions;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public DriveId getDriveId()
  {
    return zzaoz;
  }
  
  public int getEventType()
  {
    return zzanf;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.AddEventListenerRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */