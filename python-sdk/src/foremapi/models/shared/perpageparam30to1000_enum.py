import dataclasses
from enum import Enum

class PerPageParam30to1000Enum(str, Enum):
    FRESH = "fresh"
    RISING = "rising"
    ALL = "all"

