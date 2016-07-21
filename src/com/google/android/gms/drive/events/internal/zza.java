package com.google.android.gms.drive.events.internal;

import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.drive.events.zzh;
import com.google.android.gms.drive.events.zzj;

public class zza
  implements zzh
{
  private final zzj zzapV;
  private final long zzapW;
  private final long zzapX;
  
  public zza(TransferProgressData paramTransferProgressData)
  {
    zzapV = new zzb(paramTransferProgressData);
    zzapW = paramTransferProgressData.getBytesTransferred();
    zzapX = paramTransferProgressData.getTotalBytes();
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
      paramObject = (zza)paramObject;
      if ((!zzw.equal(zzapV, zzapV)) || (zzapW != zzapW)) {
        break;
      }
      bool1 = bool2;
    } while (zzapX == zzapX);
    return false;
  }
  
  public int hashCode()
  {
    return zzw.hashCode(new Object[] { Long.valueOf(zzapX), Long.valueOf(zzapW), Long.valueOf(zzapX) });
  }
  
  public String toString()
  {
    return String.format("FileTransferProgress[FileTransferState: %s, BytesTransferred: %d, TotalBytes: %d]", new Object[] { zzapV.toString(), Long.valueOf(zzapW), Long.valueOf(zzapX) });
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.events.internal.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */