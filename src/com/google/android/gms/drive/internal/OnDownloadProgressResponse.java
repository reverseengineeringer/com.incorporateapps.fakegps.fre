package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

public class OnDownloadProgressResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzay();
  private static final List zzash = ;
  final int mVersionCode;
  final int zzBc;
  final long zzasi;
  final long zzasj;
  final List zzask;
  
  OnDownloadProgressResponse(int paramInt1, long paramLong1, long paramLong2, int paramInt2, List paramList)
  {
    mVersionCode = paramInt1;
    zzasi = paramLong1;
    zzasj = paramLong2;
    zzBc = paramInt2;
    zzask = paramList;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzay.zza(this, paramParcel, paramInt);
  }
  
  public long zztq()
  {
    return zzasi;
  }
  
  public long zztr()
  {
    return zzasj;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.OnDownloadProgressResponse
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */