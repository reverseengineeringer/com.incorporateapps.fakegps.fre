package com.google.android.gms.games.quest;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;

public final class MilestoneEntity
  implements SafeParcelable, Milestone
{
  public static final Parcelable.Creator CREATOR = new MilestoneEntityCreator();
  private final int mState;
  private final int mVersionCode;
  private final String zzaDU;
  private final String zzaFd;
  private final long zzaKt;
  private final long zzaKu;
  private final byte[] zzaKv;
  
  MilestoneEntity(int paramInt1, String paramString1, long paramLong1, long paramLong2, byte[] paramArrayOfByte, int paramInt2, String paramString2)
  {
    mVersionCode = paramInt1;
    zzaFd = paramString1;
    zzaKt = paramLong1;
    zzaKu = paramLong2;
    zzaKv = paramArrayOfByte;
    mState = paramInt2;
    zzaDU = paramString2;
  }
  
  public MilestoneEntity(Milestone paramMilestone)
  {
    mVersionCode = 4;
    zzaFd = paramMilestone.getMilestoneId();
    zzaKt = paramMilestone.getCurrentProgress();
    zzaKu = paramMilestone.getTargetProgress();
    mState = paramMilestone.getState();
    zzaDU = paramMilestone.getEventId();
    paramMilestone = paramMilestone.getCompletionRewardData();
    if (paramMilestone == null)
    {
      zzaKv = null;
      return;
    }
    zzaKv = new byte[paramMilestone.length];
    System.arraycopy(paramMilestone, 0, zzaKv, 0, paramMilestone.length);
  }
  
  static int zza(Milestone paramMilestone)
  {
    return zzw.hashCode(new Object[] { paramMilestone.getMilestoneId(), Long.valueOf(paramMilestone.getCurrentProgress()), Long.valueOf(paramMilestone.getTargetProgress()), Integer.valueOf(paramMilestone.getState()), paramMilestone.getEventId() });
  }
  
  static boolean zza(Milestone paramMilestone, Object paramObject)
  {
    if (!(paramObject instanceof Milestone)) {}
    do
    {
      return false;
      if (paramMilestone == paramObject) {
        return true;
      }
      paramObject = (Milestone)paramObject;
    } while ((!zzw.equal(((Milestone)paramObject).getMilestoneId(), paramMilestone.getMilestoneId())) || (!zzw.equal(Long.valueOf(((Milestone)paramObject).getCurrentProgress()), Long.valueOf(paramMilestone.getCurrentProgress()))) || (!zzw.equal(Long.valueOf(((Milestone)paramObject).getTargetProgress()), Long.valueOf(paramMilestone.getTargetProgress()))) || (!zzw.equal(Integer.valueOf(((Milestone)paramObject).getState()), Integer.valueOf(paramMilestone.getState()))) || (!zzw.equal(((Milestone)paramObject).getEventId(), paramMilestone.getEventId())));
    return true;
  }
  
  static String zzb(Milestone paramMilestone)
  {
    return zzw.zzy(paramMilestone).zzg("MilestoneId", paramMilestone.getMilestoneId()).zzg("CurrentProgress", Long.valueOf(paramMilestone.getCurrentProgress())).zzg("TargetProgress", Long.valueOf(paramMilestone.getTargetProgress())).zzg("State", Integer.valueOf(paramMilestone.getState())).zzg("CompletionRewardData", paramMilestone.getCompletionRewardData()).zzg("EventId", paramMilestone.getEventId()).toString();
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    return zza(this, paramObject);
  }
  
  public final Milestone freeze()
  {
    return this;
  }
  
  public final byte[] getCompletionRewardData()
  {
    return zzaKv;
  }
  
  public final long getCurrentProgress()
  {
    return zzaKt;
  }
  
  public final String getEventId()
  {
    return zzaDU;
  }
  
  public final String getMilestoneId()
  {
    return zzaFd;
  }
  
  public final int getState()
  {
    return mState;
  }
  
  public final long getTargetProgress()
  {
    return zzaKu;
  }
  
  public final int getVersionCode()
  {
    return mVersionCode;
  }
  
  public final int hashCode()
  {
    return zza(this);
  }
  
  public final boolean isDataValid()
  {
    return true;
  }
  
  public final String toString()
  {
    return zzb(this);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    MilestoneEntityCreator.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.quest.MilestoneEntity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */