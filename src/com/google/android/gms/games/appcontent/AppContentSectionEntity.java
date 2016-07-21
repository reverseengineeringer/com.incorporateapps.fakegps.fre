package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import java.util.ArrayList;
import java.util.List;

public final class AppContentSectionEntity
  implements SafeParcelable, AppContentSection
{
  public static final AppContentSectionEntityCreator CREATOR = new AppContentSectionEntityCreator();
  private final ArrayList mActions;
  private final Bundle mExtras;
  private final int mVersionCode;
  private final String zzJN;
  private final ArrayList zzaDF;
  private final String zzaDH;
  private final ArrayList zzaDO;
  private final String zzaDP;
  private final String zzaDw;
  private final String zzapg;
  private final String zzyv;
  
  AppContentSectionEntity(int paramInt, ArrayList paramArrayList1, ArrayList paramArrayList2, String paramString1, Bundle paramBundle, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, ArrayList paramArrayList3)
  {
    mVersionCode = paramInt;
    mActions = paramArrayList1;
    zzaDF = paramArrayList3;
    zzaDO = paramArrayList2;
    zzaDP = paramString6;
    zzaDw = paramString1;
    mExtras = paramBundle;
    zzyv = paramString5;
    zzaDH = paramString2;
    zzapg = paramString3;
    zzJN = paramString4;
  }
  
  public AppContentSectionEntity(AppContentSection paramAppContentSection)
  {
    mVersionCode = 5;
    zzaDP = paramAppContentSection.zzwl();
    zzaDw = paramAppContentSection.zzvQ();
    mExtras = paramAppContentSection.getExtras();
    zzyv = paramAppContentSection.getId();
    zzaDH = paramAppContentSection.zzwc();
    zzapg = paramAppContentSection.getTitle();
    zzJN = paramAppContentSection.getType();
    List localList = paramAppContentSection.getActions();
    int k = localList.size();
    mActions = new ArrayList(k);
    int i = 0;
    while (i < k)
    {
      mActions.add((AppContentActionEntity)((AppContentAction)localList.get(i)).freeze());
      i += 1;
    }
    localList = paramAppContentSection.zzwk();
    k = localList.size();
    zzaDO = new ArrayList(k);
    i = 0;
    while (i < k)
    {
      zzaDO.add((AppContentCardEntity)((AppContentCard)localList.get(i)).freeze());
      i += 1;
    }
    paramAppContentSection = paramAppContentSection.zzwa();
    k = paramAppContentSection.size();
    zzaDF = new ArrayList(k);
    i = j;
    while (i < k)
    {
      zzaDF.add((AppContentAnnotationEntity)((AppContentAnnotation)paramAppContentSection.get(i)).freeze());
      i += 1;
    }
  }
  
  static int zza(AppContentSection paramAppContentSection)
  {
    return zzw.hashCode(new Object[] { paramAppContentSection.getActions(), paramAppContentSection.zzwa(), paramAppContentSection.zzwk(), paramAppContentSection.zzwl(), paramAppContentSection.zzvQ(), paramAppContentSection.getExtras(), paramAppContentSection.getId(), paramAppContentSection.zzwc(), paramAppContentSection.getTitle(), paramAppContentSection.getType() });
  }
  
  static boolean zza(AppContentSection paramAppContentSection, Object paramObject)
  {
    if (!(paramObject instanceof AppContentSection)) {}
    do
    {
      return false;
      if (paramAppContentSection == paramObject) {
        return true;
      }
      paramObject = (AppContentSection)paramObject;
    } while ((!zzw.equal(((AppContentSection)paramObject).getActions(), paramAppContentSection.getActions())) || (!zzw.equal(((AppContentSection)paramObject).zzwa(), paramAppContentSection.zzwa())) || (!zzw.equal(((AppContentSection)paramObject).zzwk(), paramAppContentSection.zzwk())) || (!zzw.equal(((AppContentSection)paramObject).zzwl(), paramAppContentSection.zzwl())) || (!zzw.equal(((AppContentSection)paramObject).zzvQ(), paramAppContentSection.zzvQ())) || (!zzw.equal(((AppContentSection)paramObject).getExtras(), paramAppContentSection.getExtras())) || (!zzw.equal(((AppContentSection)paramObject).getId(), paramAppContentSection.getId())) || (!zzw.equal(((AppContentSection)paramObject).zzwc(), paramAppContentSection.zzwc())) || (!zzw.equal(((AppContentSection)paramObject).getTitle(), paramAppContentSection.getTitle())) || (!zzw.equal(((AppContentSection)paramObject).getType(), paramAppContentSection.getType())));
    return true;
  }
  
  static String zzb(AppContentSection paramAppContentSection)
  {
    return zzw.zzy(paramAppContentSection).zzg("Actions", paramAppContentSection.getActions()).zzg("Annotations", paramAppContentSection.zzwa()).zzg("Cards", paramAppContentSection.zzwk()).zzg("CardType", paramAppContentSection.zzwl()).zzg("ContentDescription", paramAppContentSection.zzvQ()).zzg("Extras", paramAppContentSection.getExtras()).zzg("Id", paramAppContentSection.getId()).zzg("Subtitle", paramAppContentSection.zzwc()).zzg("Title", paramAppContentSection.getTitle()).zzg("Type", paramAppContentSection.getType()).toString();
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    return zza(this, paramObject);
  }
  
  public final List getActions()
  {
    return new ArrayList(mActions);
  }
  
  public final Bundle getExtras()
  {
    return mExtras;
  }
  
  public final String getId()
  {
    return zzyv;
  }
  
  public final String getTitle()
  {
    return zzapg;
  }
  
  public final String getType()
  {
    return zzJN;
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
    AppContentSectionEntityCreator.zza(this, paramParcel, paramInt);
  }
  
  public final String zzvQ()
  {
    return zzaDw;
  }
  
  public final List zzwa()
  {
    return new ArrayList(zzaDF);
  }
  
  public final String zzwc()
  {
    return zzaDH;
  }
  
  public final List zzwk()
  {
    return new ArrayList(zzaDO);
  }
  
  public final String zzwl()
  {
    return zzaDP;
  }
  
  public final AppContentSection zzwm()
  {
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.appcontent.AppContentSectionEntity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */