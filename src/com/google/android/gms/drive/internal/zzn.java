package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class zzn
  implements Parcelable.Creator
{
  static void zza(CreateFileRequest paramCreateFileRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, mVersionCode);
    zzb.zza(paramParcel, 2, zzaqy, paramInt, false);
    zzb.zza(paramParcel, 3, zzaqw, paramInt, false);
    zzb.zza(paramParcel, 4, zzaql, paramInt, false);
    zzb.zza(paramParcel, 5, zzaqx, false);
    zzb.zza(paramParcel, 6, zzaqd);
    zzb.zza(paramParcel, 7, zzaoV, false);
    zzb.zzc(paramParcel, 8, zzaqz);
    zzb.zzc(paramParcel, 9, zzaqA);
    zzb.zza(paramParcel, 10, zzaoY, false);
    zzb.zzI(paramParcel, i);
  }
  
  public CreateFileRequest zzbk(Parcel paramParcel)
  {
    int i = 0;
    String str1 = null;
    int m = zza.zzau(paramParcel);
    int j = 0;
    String str2 = null;
    boolean bool = false;
    Integer localInteger = null;
    Contents localContents = null;
    MetadataBundle localMetadataBundle = null;
    DriveId localDriveId = null;
    int k = 0;
    while (paramParcel.dataPosition() < m)
    {
      int n = zza.zzat(paramParcel);
      switch (zza.zzca(n))
      {
      default: 
        zza.zzb(paramParcel, n);
        break;
      case 1: 
        k = zza.zzg(paramParcel, n);
        break;
      case 2: 
        localDriveId = (DriveId)zza.zza(paramParcel, n, DriveId.CREATOR);
        break;
      case 3: 
        localMetadataBundle = (MetadataBundle)zza.zza(paramParcel, n, MetadataBundle.CREATOR);
        break;
      case 4: 
        localContents = (Contents)zza.zza(paramParcel, n, Contents.CREATOR);
        break;
      case 5: 
        localInteger = zza.zzh(paramParcel, n);
        break;
      case 6: 
        bool = zza.zzc(paramParcel, n);
        break;
      case 7: 
        str2 = zza.zzp(paramParcel, n);
        break;
      case 8: 
        j = zza.zzg(paramParcel, n);
        break;
      case 9: 
        i = zza.zzg(paramParcel, n);
        break;
      case 10: 
        str1 = zza.zzp(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != m) {
      throw new zza.zza("Overread allowed size end=" + m, paramParcel);
    }
    return new CreateFileRequest(k, localDriveId, localMetadataBundle, localContents, localInteger, bool, str2, j, i, str1);
  }
  
  public CreateFileRequest[] zzdb(int paramInt)
  {
    return new CreateFileRequest[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */