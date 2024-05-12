package com.overeasy.smartfitness.scenario.workout.workout

import com.overeasy.smartfitness.domain.workout.model.workout.WorkoutData

data class WorkoutInfo(
    val workoutName: String,
    val restTime: Int?, // sec
    val setDataList: List<WorkoutData>,
//    val setDataList: List<Pair<Int?, Int?>>,
)
