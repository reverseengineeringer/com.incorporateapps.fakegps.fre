package com.google.android.gms.drive.events.internal;

import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.zzj;

public class zzb
  implements zzj
{
  private final int zzBc;
  private final DriveId zzaoz;
  private final int zzapT;
  
  public zzb(TransferProgressData paramTransferProgressData)
  {
    zzaoz = paramTransferProgressData.getDriveId();
    zzapT = paramTransferProgressData.zztb();
    zzBc = paramTransferProgressData.getStatus();
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
      paramObject = (zzb)paramObject;
      if ((!zzw.equal(zzaoz, zzaoz)) || (zzapT != zzapT)) {
        break;
      }
      bool1 = bool2;
    } while (zzBc == zzBc);
    return false;
  }
  
  public int hashCode()
  {
    return zzw.hashCode(new Object[] { zzaoz, Integer.valueOf(zzapT), Integer.valueOf(zzBc) });
  }
  
  public String toString()
  {
    return String.format("FileTransferState[TransferType: %d, DriveId: %s, status: %d]", new Object[] { Integer.valueOf(zzapT), zzaoz, Integer.valueOf(zzBc) });
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.events.internal.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */