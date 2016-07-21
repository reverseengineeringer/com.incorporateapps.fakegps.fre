package com.google.android.gms.games.internal.multiplayer;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzb;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.multiplayer.InvitationEntity;
import com.google.android.gms.games.multiplayer.Participant;
import java.util.ArrayList;

public final class ZInvitationCluster
  implements SafeParcelable, Invitation
{
  public static final InvitationClusterCreator CREATOR = new InvitationClusterCreator();
  private final int mVersionCode;
  private final ArrayList zzaIl;
  
  ZInvitationCluster(int paramInt, ArrayList paramArrayList)
  {
    mVersionCode = paramInt;
    zzaIl = paramArrayList;
    zzxr();
  }
  
  private void zzxr()
  {
    if (!zzaIl.isEmpty()) {}
    for (boolean bool = true;; bool = false)
    {
      zzb.zzab(bool);
      Invitation localInvitation1 = (Invitation)zzaIl.get(0);
      int j = zzaIl.size();
      int i = 1;
      while (i < j)
      {
        Invitation localInvitation2 = (Invitation)zzaIl.get(i);
        zzb.zza(localInvitation1.getInviter().equals(localInvitation2.getInviter()), "All the invitations must be from the same inviter");
        i += 1;
      }
    }
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof ZInvitationCluster)) {
      return false;
    }
    if (this == paramObject) {
      return true;
    }
    paramObject = (ZInvitationCluster)paramObject;
    if (zzaIl.size() != zzaIl.size()) {
      return false;
    }
    int j = zzaIl.size();
    int i = 0;
    while (i < j)
    {
      if (!((Invitation)zzaIl.get(i)).equals((Invitation)zzaIl.get(i))) {
        return false;
      }
      i += 1;
    }
    return true;
  }
  
  public final Invitation freeze()
  {
    return this;
  }
  
  public final int getAvailableAutoMatchSlots()
  {
    throw new UnsupportedOperationException("Method not supported on a cluster");
  }
  
  public final long getCreationTimestamp()
  {
    throw new UnsupportedOperationException("Method not supported on a cluster");
  }
  
  public final Game getGame()
  {
    throw new UnsupportedOperationException("Method not supported on a cluster");
  }
  
  public final String getInvitationId()
  {
    return ((InvitationEntity)zzaIl.get(0)).getInvitationId();
  }
  
  public final int getInvitationType()
  {
    throw new UnsupportedOperationException("Method not supported on a cluster");
  }
  
  public final Participant getInviter()
  {
    return ((InvitationEntity)zzaIl.get(0)).getInviter();
  }
  
  public final ArrayList getParticipants()
  {
    throw new UnsupportedOperationException("Method not supported on a cluster");
  }
  
  public final int getVariant()
  {
    throw new UnsupportedOperationException("Method not supported on a cluster");
  }
  
  public final int getVersionCode()
  {
    return mVersionCode;
  }
  
  public final int hashCode()
  {
    return zzw.hashCode(zzaIl.toArray());
  }
  
  public final boolean isDataValid()
  {
    return true;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    InvitationClusterCreator.zza(this, paramParcel, paramInt);
  }
  
  public final ArrayList zzxs()
  {
    return new ArrayList(zzaIl);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.multiplayer.ZInvitationCluster
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */