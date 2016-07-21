package com.google.android.gms.clearcut;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.internal.zzsz.zzd;
import com.google.android.gms.playlog.internal.PlayLoggerContext;
import java.util.Arrays;

public class LogEventParcelable
  implements SafeParcelable
{
  public static final zzd CREATOR = new zzd();
  public final int versionCode;
  public PlayLoggerContext zzafh;
  public byte[] zzafi;
  public int[] zzafj;
  public final zzsz.zzd zzafk;
  public final zzb.zzb zzafl;
  public final zzb.zzb zzafm;
  
  LogEventParcelable(int paramInt, PlayLoggerContext paramPlayLoggerContext, byte[] paramArrayOfByte, int[] paramArrayOfInt)
  {
    versionCode = paramInt;
    zzafh = paramPlayLoggerContext;
    zzafi = paramArrayOfByte;
    zzafj = paramArrayOfInt;
    zzafk = null;
    zzafl = null;
    zzafm = null;
  }
  
  public LogEventParcelable(PlayLoggerContext paramPlayLoggerContext, zzsz.zzd paramzzd, zzb.zzb paramzzb1, zzb.zzb paramzzb2, int[] paramArrayOfInt)
  {
    versionCode = 1;
    zzafh = paramPlayLoggerContext;
    zzafk = paramzzd;
    zzafl = paramzzb1;
    zzafm = paramzzb2;
    zzafj = paramArrayOfInt;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof LogEventParcelable)) {
        break;
      }
      paramObject = (LogEventParcelable)paramObject;
    } while ((versionCode == versionCode) && (zzw.equal(zzafh, zzafh)) && (Arrays.equals(zzafi, zzafi)) && (Arrays.equals(zzafj, zzafj)) && (zzw.equal(zzafk, zzafk)) && (zzw.equal(zzafl, zzafl)) && (zzw.equal(zzafm, zzafm)));
    return false;
    return false;
  }
  
  public int hashCode()
  {
    return zzw.hashCode(new Object[] { Integer.valueOf(versionCode), zzafh, zzafi, zzafj, zzafk, zzafl, zzafm });
  }
  
  public String toString()
  {
    Object localObject2 = null;
    StringBuilder localStringBuilder = new StringBuilder("LogEventParcelable[");
    localStringBuilder.append(versionCode);
    localStringBuilder.append(", ");
    localStringBuilder.append(zzafh);
    localStringBuilder.append(", ");
    if (zzafi == null)
    {
      localObject1 = null;
      localStringBuilder.append((String)localObject1);
      localStringBuilder.append(", ");
      if (zzafj != null) {
        break label156;
      }
    }
    label156:
    for (Object localObject1 = localObject2;; localObject1 = zzv.zzcL(", ").zza(Arrays.asList(new int[][] { zzafj })))
    {
      localStringBuilder.append((String)localObject1);
      localStringBuilder.append(", ");
      localStringBuilder.append(zzafk);
      localStringBuilder.append(", ");
      localStringBuilder.append(zzafl);
      localStringBuilder.append(", ");
      localStringBuilder.append(zzafm);
      localStringBuilder.append("]");
      return localStringBuilder.toString();
      localObject1 = new String(zzafi);
      break;
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzd.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.clearcut.LogEventParcelable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */