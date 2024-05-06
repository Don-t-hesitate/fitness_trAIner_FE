package com.overeasy.smartfitness.domain.diary

import com.overeasy.smartfitness.domain.diary.entity.GetDiaryDetailRes
import com.overeasy.smartfitness.domain.diary.entity.GetDiaryRes

interface DiaryRepository {
    suspend fun getDiary(date: String): GetDiaryRes
    suspend fun getDiaryDetail(noteId: Int): GetDiaryDetailRes
}