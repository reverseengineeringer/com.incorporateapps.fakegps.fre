package com.google.android.gms.drive.events;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.ArrayList;

public class zze
  implements Parcelable.Creator
{
  static void zza(CompletionEvent paramCompletionEvent, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, mVersionCode);
    zzb.zza(paramParcel, 2, zzaoz, paramInt, false);
    zzb.zza(paramParcel, 3, zzVa, false);
    zzb.zza(paramParcel, 4, zzapD, paramInt, false);
    zzb.zza(paramParcel, 5, zzapE, paramInt, false);
    zzb.zza(paramParcel, 6, zzapF, paramInt, false);
    zzb.zzb(paramParcel, 7, zzapG, false);
    zzb.zzc(paramParcel, 8, zzBc);
    zzb.zza(paramParcel, 9, zzapH, false);
    zzb.zzI(paramParcel, i);
  }
  
  public CompletionEvent zzaS(Parcel paramParcel)
  {
    int i = 0;
    IBinder localIBinder = null;
    int k = zza.zzau(paramParcel);
    ArrayList localArrayList = null;
    MetadataBundle localMetadataBundle = null;
    ParcelFileDescriptor localParcelFileDescriptor1 = null;
    ParcelFileDescriptor localParcelFileDescriptor2 = null;
    String str = null;
    DriveId localDriveId = null;
    int j = 0;
    while (paramParcel.dataPosition() < k)
    {
      int m = zza.zzat(paramParcel);
      switch (zza.zzca(m))
      {
      default: 
        zza.zzb(paramParcel, m);
        break;
      case 1: 
        j = zza.zzg(paramParcel, m);
        break;
      case 2: 
        localDriveId = (DriveId)zza.zza(paramParcel, m, DriveId.CREATOR);
        break;
      case 3: 
        str = zza.zzp(paramParcel, m);
        break;
      case 4: 
        localParcelFileDescriptor2 = (ParcelFileDescriptor)zza.zza(paramParcel, m, ParcelFileDescriptor.CREATOR);
        break;
      case 5: 
        localParcelFileDescriptor1 = (ParcelFileDescriptor)zza.zza(paramParcel, m, ParcelFileDescriptor.CREATOR);
        break;
      case 6: 
        localMetadataBundle = (MetadataBundle)zza.zza(paramParcel, m, MetadataBundle.CREATOR);
        break;
      case 7: 
        localArrayList = zza.zzD(paramParcel, m);
        break;
      case 8: 
        i = zza.zzg(paramParcel, m);
        break;
      case 9: 
        localIBinder = zza.zzq(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new zza.zza("Overread allowed size end=" + k, paramParcel);
    }
    return new CompletionEvent(j, localDriveId, str, localParcelFileDescriptor2, localParcelFileDescriptor1, localMetadataBundle, localArrayList, i, localIBinder);
  }
  
  public CompletionEvent[] zzcH(int paramInt)
  {
    return new CompletionEvent[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.events.zze
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */