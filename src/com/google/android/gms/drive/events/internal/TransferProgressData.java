package com.google.android.gms.drive.events.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.drive.DriveId;

public class TransferProgressData
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzc();
  final int mVersionCode;
  final int zzBc;
  final DriveId zzaoz;
  final int zzapT;
  final long zzapW;
  final long zzapX;
  
  TransferProgressData(int paramInt1, int paramInt2, DriveId paramDriveId, int paramInt3, long paramLong1, long paramLong2)
  {
    mVersionCode = paramInt1;
    zzapT = paramInt2;
    zzaoz = paramDriveId;
    zzBc = paramInt3;
    zzapW = paramLong1;
    zzapX = paramLong2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool2 = true;
    boolean bool1;
    if ((paramObject == null) || (paramObject.getClass() != getClass())) {
      bool1 = false;
    }
    do
    {
      do
      {
        return bool1;
        bool1 = bool2;
      } while (paramObject == this);
      paramObject = (TransferProgressData)paramObject;
      if ((zzapT != zzapT) || (!zzw.equal(zzaoz, zzaoz)) || (zzBc != zzBc) || (zzapW != zzapW)) {
        break;
      }
      bool1 = bool2;
    } while (zzapX == zzapX);
    return false;
  }
  
  public long getBytesTransferred()
  {
    return zzapW;
  }
  
  public DriveId getDriveId()
  {
    return zzaoz;
  }
  
  public int getStatus()
  {
    return zzBc;
  }
  
  public long getTotalBytes()
  {
    return zzapX;
  }
  
  public int hashCode()
  {
    return zzw.hashCode(new Object[] { Integer.valueOf(zzapT), zzaoz, Integer.valueOf(zzBc), Long.valueOf(zzapW), Long.valueOf(zzapX) });
  }
  
  public String toString()
  {
    return String.format("TransferProgressData[TransferType: %d, DriveId: %s, status: %d, bytes transferred: %d, total bytes: %d]", new Object[] { Integer.valueOf(zzapT), zzaoz, Integer.valueOf(zzBc), Long.valueOf(zzapW), Long.valueOf(zzapX) });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzc.zza(this, paramParcel, paramInt);
  }
  
  public int zztb()
  {
    return zzapT;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.events.internal.TransferProgressData
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */